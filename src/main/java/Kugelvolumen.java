public class Kugelvolumen {
    public static void main(String[]args){

    }
        public static double berechneKugelvolumen(double radius) {
            if(radius>=0){
                return 4/3*Math.PI*radius*radius*radius;
            }else{
                throw new IllegalArgumentException ("Der Radius darf nicht negativ sein ");

            }

        }


}

