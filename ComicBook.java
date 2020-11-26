package myonlineshop;

public class ComicBook extends Book{
	String characterName;
	ComicBook(double regularPrice, String publisher, int yearPublished, String characterName) {
		super(regularPrice, publisher, yearPublished);
		setCharacterName(characterName);
	}
	 public double computeSalePrice(){
	        return getRegularPrice()*0.4;
	    }
	public String getCharacterName() {
		return characterName;
	}
	public void setCharacterName(String characterName) {
		this.characterName = characterName;
	}
}
