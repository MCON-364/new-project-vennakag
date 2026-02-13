package mcon364.las.touro.edu;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {

    }

    public static Optional<String> getUserName(String envVarName){
        return Optional.ofNullable(System.getenv(envVarName));
    }

    public static String getGreeting(String envVarName){

        if(getUserName(envVarName).isPresent()){
            StringBuilder name  = new StringBuilder();
            name.append("Hello, ");
            name.append(getUserName(envVarName).get());
            return name.toString();
        }
        return "Hello, World";
    }

    public static int processValues(List<List<Integer>> data){
        int count = 0;
        outer:
        for(List<Integer> row : data){
            inner:
           for(int i : row){
               if(i==0){
                   continue outer;
               }
               if(i==99){
                   break outer;
               }
               count ++;
           }
        }
        return count;
    }
}
