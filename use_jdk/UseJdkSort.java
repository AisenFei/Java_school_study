package cn.JavaSE.use_jdk;

import java.util.*;

public class UseJdkSort {
    private static String[] names = {"哈利波特","张三丰",
        "张三","李四","王五","赵六","填其","正方形","长方形","圆形"};
    private static Person[] createPersonArray(){
        Person[] personArray = new Person[10];
        for(int i = 0;i < 10;i++){
            personArray[i] = new Person();
        }

        List<String> namesListOld = Arrays.asList(names);
        List<String> nameList = new ArrayList<>(namesListOld);
        Collections.shuffle(nameList);
        Random random = new Random();
        for(int i = 0;i < 10;i++){
            personArray[i].name = nameList.remove(0);
            personArray[i].age = random.nextInt(30) + 5;
            personArray[i].height = random.nextInt(100) + 100;
            personArray[i].weight = random.nextInt(100) + 100;
        }

        return personArray;
    }

    public static void main(String[] args){
        Person[] personArray = createPersonArray();
        System.out.println(Arrays.toString(personArray));
        Arrays.sort(personArray,new Comparator<Person>(){
            @Override
            public int compare(Person o1, Person o2) {
                return o1.age - o2.age;
            }
        });
        System.out.println(Arrays.toString(personArray));
    }
}
