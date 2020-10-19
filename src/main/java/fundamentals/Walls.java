package fundamentals;


//POJO
//stands for plain old java object
public class Walls {


    private static int amountOfWalls = 0;
    private String paintColor;
    private boolean hasWallpaper;


    public Walls(String paintColor, boolean hasWallpaper){
        this.hasWallpaper = hasWallpaper;
        this.paintColor = paintColor;
        amountOfWalls++;
    }

    public String getPaintColor(){
        return paintColor;
    }

    public boolean getWallpaper(){
        return hasWallpaper;
    }

    public void setPaintColor(String paintColor){
        this.paintColor = paintColor;
    }

    public void setWallpaper(boolean hasWallpaper){
        this.hasWallpaper = hasWallpaper;
    }

    public int getAmountOfWalls(){
        return amountOfWalls;
    }


}

