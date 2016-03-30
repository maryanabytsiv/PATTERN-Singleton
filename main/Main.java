package main;

import additional.*;

public class Main {

	public static void main(String[] args) {

		PostMan postMan = PostMan.getInstance();
		System.out.println(postMan.toString());
		PostMan postMan2 = PostMan.getInstance();
		System.out.println(postMan2.toString());

		System.out.println("---------------------------------");
		Sender sender = Sender.getInstance();
		Sender sender2 = Sender.getInstance();
		System.out.println(sender.toString());
		System.out.println(sender2.toString());

        System.out.println("---------------------------------");
        Checker check1 = Checker.getInstance();
        Checker check2 = Checker.getInstance();
        System.out.println(check1.toString());
        System.out.println(check2.toString());

        System.out.println("---------------------------------");
        Holder hold1 = Holder.getInstance();
        Holder hold2 = Holder.getInstance();
        System.out.println(hold1.toString());
        System.out.println(hold2.toString());

        System.out.println("---------------------------------");
        System.out.println(Singleton.INSTANCE.toString());

	}

}