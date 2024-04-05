public class Figure {

        public double calculateArea(){
            return 0;
        }

        public boolean compareAreas(Figure all){
            if (this.calculateArea() == all.calculateArea()){
                return true;
            }
            else {
                return false;
            }
        }
    }