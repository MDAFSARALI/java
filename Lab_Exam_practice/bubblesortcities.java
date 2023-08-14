public class bubblesortcities {
    public static void main(String[] args) {
        String cities []=args;
        int n=cities.length;
        for (int i=0;i<n-1;i++){
            for (int j=0;j<n-1;j++){
                if (cities[j].compareToIgnoreCase(cities[j+1])>0){
                    String temp = cities[j];
                    cities[j]=cities[j+1];
                    cities[j+1]=temp;
                }
            }
        }
        System.out.println("Sorted citiesname is  :");
        for (String city : cities) {
            System.out.println(city);
            
        }
    }
}
