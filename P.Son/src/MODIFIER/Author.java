public class Author {
    Person p = new Person();
    
    public Author(){
        // akan terjadi eror di sini karena atribut name
        // telah diberikan modifier protected
        p.name = "AKBARR";
    }
}
