package enumeratition_enum.abstract_methods_in_enums.examples;

public enum CarPriceLIst {
    LOTUS(50){
        @Override
        public String getCurrency() {
            return "$ grand";
        }
        @Override
        public String getInfo (){
            return super.toString()+" "+getCurrency();
        }

    },

    ASTON(60){
        @Override
        public String getCurrency() {
            return "$ grand";
        }
         @Override
        public String getInfo (){
            return super.toString()+" "+getCurrency();
        }

    },

    LAMBO(80){
        @Override
        public String getCurrency() {
            return "$ grand";
        }
        @Override
        public String getInfo (){
            return super.toString()+" "+getCurrency();
        }
    };

    private int price;   // field

    CarPriceLIst(int price) {   ///constructor

        this.price = price; }


        public int getPrice(){return this.price; }

        public abstract String getCurrency ();
       public abstract String getInfo ();

    public String toString (){
        return " this model "+super.toString()+"  is sold for "+getPrice();
    }


}

