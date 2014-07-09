import Constants.Constant;
import factory.DesignTest;
import factory.ObjectFactory;

import java.util.logging.Logger;

/**
 * Created by Flop Coder on 7/8/14.
 */
public class Main {
    static Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        DesignTest designTest = ObjectFactory.testDesignPattern(Constant.PROTOTYPE);
        designTest.test();
    }
}