//This is Bmi Calculator TO Count the body Mass Index with weight and height in cm


class BMI{
    Double weight;
    Double height;

     Double getWeight() {
        return weight;
    }

     void setWeight(Double weight) {
        this.weight = weight;
    }

    Double getHeight() {
        return height;
    }

     void setHeight(Double height) {
        this.height = height;
    }
    Double bmi(){
//         Double total= Double.valueOf(weight/(height*height));
        Double total= weight/(height*height)*10000;
         return total;

    }
}

public class getterSetter {
    public static void main(String[] args) {

    BMI dhaval=new BMI();
    dhaval.setWeight(Double.valueOf(69));
    dhaval.setHeight(Double.valueOf(175));
        System.out.println(dhaval.bmi());
    }


}
