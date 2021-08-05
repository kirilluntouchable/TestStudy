public class Competition implements Obstaclable {
    int length;

    public Competition(int length) {
        this.length = length;
    }

    @Override
    public boolean toRun(int maxLength) {
        return (maxLength >= length);
    }

    @Override
    public boolean toJump(int maxHeight) {
        return false;
    }

    @Override
    public String toString() {
        return "Беговую дорожку длиной " + length + " м";
    }
}