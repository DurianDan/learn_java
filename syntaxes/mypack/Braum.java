package mypack;

public class Braum implements Guardian {

    @Override
    public String protectWho() {
        return "Freljord";
    }

    @Override
    public String projectFrom() {
        return "Bear";
    }

    @Override
    public String getName() {
        return "Braum";
    }

    @Override
    public String getProtectionMethod() {
        return "Big Heart holding Big Door";
    }

}
