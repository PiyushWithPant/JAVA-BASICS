public class arithmaticOperations {
    public static void main(String[] args) throws Exception {

        // byte < short < int < long

        // addition

        int add = 100 + 303403;

        System.out.println(add);

        // division

        int div = 1000 / 3;
        System.out.println(div);

        // Notice that the result is not in decimal but just in integer
        // if we want the decimal result than, do this

        // div = (double)1000 / (double)3

        // it will convert the type of 1000 and 3 to DOUBLE, this is typecasting
        // however, an error will come saying that the expression gives double result
        // but it is declared as a integer, That is why we will do this

        double divs = 1000 / 3;
        System.out.println(divs); // result would be just 333.0
        // the result is just in decimal but it isn't accurate yet
        // so we will convert the types of values as well

        double divss = (double) 1000 / (double) 3;
        System.out.println(divss); // this gives us 333.33333 , so it's correct way

        // Increment and decrement

        // remember that short stores value between -32k to 32k (32767)
        short y = 31999;
        y++; // post fix

        ++y; // pre fix
        System.out.println(y);

        // ! FUN ACTIVITY

        // like i researched, they said till 32k but its at 32767
        // after this if we add more, it will go back to negative value
        short x = 32767; // after 32767, it gives error for short
        x++;
        System.out.println(x); // answer should be 32768 but since it is short
        // so this is answer -32768

        // lets understand the postfix and prefix

        byte m = 10; // byte holds around 127

        // Post fix
        byte n = m++; // both m and n are updated, n will just save the value of m before it was
                      // incremented
        System.out.println(n);
        // In this case, first the value of m is copied to n and then it is incremented
        // result will be 10, then one will increment after the print so it won't show
        System.out.println(m); // now this became 11

        // Pre fix
        byte o = ++m; // m is 11 now
        // the value of m will first be incremented and then saved
        System.out.println(o);
        System.out.println(m);
        // Result will be 12 cuz the value of m is already incremented to 11 from post
        // fix

        // since n used the post fix so that value of m was saved to n first, and then m
        // was incremented that is why n is not 11 but just 10
        System.out.println(n);

        // ! Implicit and Explicit casting

        // when we have a smaller dataype say short and then we upgrade it to int, this
        // happens automatically so this type of automatic conversion from smaller to
        // bigger datatypes is called as Implicit casting

        short low = 3;

        int high = low + 2;
        // see the 2, it is converted as int automatically and the low as well since int
        // is bigger than the short

        // However, what if you want to degrade the datatype? eg make int to short
        // or double to int

        double d = 30.03;

        // int e = d + 1;
        // now this will gives us error since result should be integer but there is a
        // double term, which will give double output,
        // in this case, we will have to manually convert the datatype of double in
        // order to match the int, this is called Explicit Casting when the developer
        // has to upgrade the datatype on his own to match the result

        int e = (int) d + 1;

        // ! Parsing

        // lets say i wanna add a string and a number then i will use the Integer
        // package and its function parseInt

        String numb = "99";

        int sum = Integer.parseInt(numb) + 1;

        System.out.println(sum); // 100

        // same way

        numb = "99.1"; // double but in string
        // remember that in JAVA, all decimal numbers are automatically DOUBLE, if u
        // wanna make them float, use the f

        double summ = Double.parseDouble(numb) + 0.9;

        System.out.println(summ);

    }
}
