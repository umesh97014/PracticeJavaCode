package automationpractice;

public class InheritanceA {
	int i;
    void methodOne()
    {
        System.out.println("From methodOne");
    }
}

public class InheritanceB extends InheritanceA {
	int j;
    void methodTwo()
    {
        System.out.println("From methodTwo");
    }
}
