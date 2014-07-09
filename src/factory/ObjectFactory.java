package factory;

import Patterns.abstract_factory.AbstractFactoryTest;
import Constants.Constant;
import Patterns.prototype.PrototypeTest;
import Patterns.singletone.SingletonTest;

/**
 * Created by Flop Coder on 7/10/14.
 */
public class ObjectFactory {

    public static DesignTest testDesignPattern(String nameOfPattern) {
        if (nameOfPattern.equals(Constant.SINGLETON))
            return new SingletonTest();
        else if (nameOfPattern.equals(Constant.PROTOTYPE))
            return new PrototypeTest();
        else if(nameOfPattern.equals(Constant.ABSTRUCT_FACTORY))
            return new AbstractFactoryTest();
        return null;
    }
}
