import java.util.*;


public class DestinationCity {
    public static void main(String[] args) {
        List<List<String>> paths = new ArrayList<>();
        List<String> path1 = new ArrayList<>();
        path1.add("London");
        path1.add("New York");
        paths.add(path1);
        List<String> path2 = new ArrayList<>();
        path2.add("New York");
        path2.add("Lima");
        paths.add(path2);
        List<String> path3 = new ArrayList<>();
        path3.add("Lima");
        path3.add("Sao Polo");
        paths.add(path3);

        //call the method
        String destCity = findDestinationCity(paths);
        System.out.println(destCity);
    }

    private static String findDestinationCity(List<List<String>> paths) {
        HashSet<String> cities = new HashSet<>();
        for(List<String> path : paths){
            cities.add(path.get(0));
        }
        for(List<String> path : paths){
            String city = path.get(1);
            if(!cities.contains(city)){
                return city;
            }
        }
        return "";
    }
}
