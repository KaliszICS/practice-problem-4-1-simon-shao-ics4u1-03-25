public class Person{

    private int age;
    private String name;
    private int height;
    private int weight;
    private String eyeColour;
    private String hairColour;

    public Person(String name, int age, int height, int weight, String eyeColour, String hairColour){
        this.age = age;
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.eyeColour = eyeColour;
        this.hairColour = hairColour;
    }

    public int getAge(){
        return this.age;
    }


    public int getWeight(){
        return this.weight;
    }


    public int getHeight(){
        return this.height;
    }


    public String getName(){
        return this.name;
    }

    public String getEyeColour(){
        return this.eyeColour;
    }

    public String getHairColour(){
        return this.hairColour;
    }
}