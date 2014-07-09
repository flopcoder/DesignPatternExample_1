package patterns.singletone;

import factory.DesignTest;

/**
 * Created by Flop Coder on 7/10/14.
 */
public class SingletonTest implements DesignTest {

    @Override
    public void test() {
        SingleToneSample singleToneSample = SingleToneSample.getSingleToneSample();
        SingleToneSample ex2 = SingleToneSample.getSingleToneSample();
    }
}
