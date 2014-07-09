package Patterns.singletone;

/**
 * Created by Flop Coder on 7/8/14.
 */
public class SingleToneSample {

    private static SingleToneSample singleToneSample;

    private SingleToneSample() {
        System.out.println("SingleToneSample(): Initializing Instance");
    }
    public static SingleToneSample getSingleToneSample() {
        if (singleToneSample == null) {
            synchronized (SingleToneSample.class) {
                if (singleToneSample == null) {
                    System.out.println("getSingleToneSample() OBJECT WILL CREATE");
                    singleToneSample = new SingleToneSample();
                    System.out.println("getSingleToneSample() OBJECT IS CREATED");
                }
            }
        }
        System.out.println("INSTANCE IS AVAILABLE... :P");

        return singleToneSample;
    }

    public void doSomething() {
        System.out.println("doSomethingc(): Singleton does something!");
    }
}
