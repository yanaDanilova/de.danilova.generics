import java.util.ArrayList;


public class  Box <T extends Fruit> {
   ArrayList<T> contentsOfBox;

    public ArrayList<T> getBox() {
        return contentsOfBox;
    }

    public void setBox(ArrayList<T> box) {
        this.contentsOfBox = box;
    }

    public Box() {
        this.contentsOfBox = new ArrayList<>();
    }

    public Box(ArrayList<T> box){
        this.contentsOfBox = box;

    }



    public double getWeightOfBox (Box <?> box){
        double weightOfBox = 0;
        for (int i = 0; i < box.contentsOfBox.size(); i++) {
            weightOfBox += contentsOfBox.get(i).getWeigh();
       }
        return weightOfBox;
    }


    public boolean compareBox(Box<?> box) {
        return Math.abs(this.getWeightOfBox(this) - box.getWeightOfBox(box)) < 0.00001;
    }


    public void moveToAnotherBox(Box<T> anotherBox){
        if(anotherBox.contentsOfBox.isEmpty()){
            anotherBox.contentsOfBox.addAll(0,this.contentsOfBox);
        }
        else{
            anotherBox.contentsOfBox.addAll((contentsOfBox.size()-1),this.contentsOfBox);

        }

        this.contentsOfBox.clear();
    }


}

