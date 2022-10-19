public class Cat {
    private String name;
    public Cat(String name)
    {
        super();
        this.name=name;
    }
    public Cat()
    {
        super();

    }
    public String getVoice()
    {
        return "Mewoo";
    }
    public String toString()
    {
        return "Cat[name="+name+"]";
    }
}
