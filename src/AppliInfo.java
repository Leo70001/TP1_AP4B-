public class AppliInfo {
private String name;
private  String version;
private  String author;
private String info;

public AppliInfo(String name, String version, String author, String info){
    this.name = name;
    this.version = version;
    this.author = author;
    this.info = info;
}

public String getDescription(){
    String description = "";
    description = description.concat("===" + name + "===\n");
    description = description.concat("Version:" +version+ "\n");
    description = description.concat("Auteur:" + author+ "\n");
    description = description.concat(info);
    return  description;

}

}
