package ra.enity;

public class Length{
    private int minLength;
    private int maxLength;

    public Length(int minLength, int maxLength){
        this.minLength = minLength;
        this.maxLength = maxLength;
    }

    public int getMinLength(){
        return minLength;
    }

    public int getMaxLength(){
        return maxLength;
    }
}
