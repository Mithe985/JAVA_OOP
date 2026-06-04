class CgpaCalculation{
    public static void main(String[] args) {
        double[][]grades={
           
            {3.5, 3.0, 3.75, 4.0, 3.25},
            {3.0, 3.25, 3.5, 3.75, 3.0},
            {4.0, 3.75, 3.5, 3.25, 3.0},
            {2.75, 3.0, 3.25, 3.5, 3.75},
            {3.25, 3.5, 3.75, 4.0, 3.5}
        }; 
        double [] credits={3,3,3,3,3};
        double totalWeightCreditPoint=0;
            double totalCredit=0;

        for(int i=0;i<5;i++){
            
            for(int j=0;j<5;j++){
                totalWeightCreditPoint +=grades[i][j]*credits[j];
                totalCredit +=credits[j];

            }
            double cgpa=totalWeightCreditPoint/totalCredit;
            System.out.println(cgpa);
        }

        }
    }
