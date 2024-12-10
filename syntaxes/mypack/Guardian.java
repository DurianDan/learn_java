package mypack;

// interface are like classes in many ways
// can not create instaces, are for polymorphism
public interface Guardian {
    // the attributes of an interface by default is
    // public, static and final 
    // just like the values of an Enum
    int AGE = 1000;
    String MISSION = "To Project";

    String protectWho();
    String projectFrom();
    String getName();
    String getProtectionMethod();
}
