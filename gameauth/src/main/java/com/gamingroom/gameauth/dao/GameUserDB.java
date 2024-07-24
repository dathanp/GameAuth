package com.gamingroom.gameauth.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.gamingroom.gameauth.representations.GameUserInfo;
 
public class GameUserDB {
	
	public static ArrayList<String> firstNames = new ArrayList<>();
	public static ArrayList<String> lastNames = new ArrayList<>();
	public static ArrayList<String> countryNames = new ArrayList<>();
	
	public static HashMap<Integer, GameUserInfo> gameUserInfos = new HashMap<>();
    static{
        gameUserInfos.put(1, new GameUserInfo(1, "Lokesh", "Gupta", "India"));
        gameUserInfos.put(2, new GameUserInfo(2, "John", "Gruber", "USA"));
        gameUserInfos.put(3, new GameUserInfo(3, "Melcum", "Marshal", "AUS"));
    }
     
    public static List<GameUserInfo> getGameUsers(){
        return new ArrayList<GameUserInfo>(gameUserInfos.values());
    }
     
    public static GameUserInfo getGameUser(Integer id){
        return gameUserInfos.get(id);
    }
     
    public static void updateGameUser(Integer id, GameUserInfo gameUserInfo){
        gameUserInfos.put(id, gameUserInfo);
    }
     
    public static void removeGameUser(Integer id){
        gameUserInfos.remove(id);
    }
    
    public static String createRandomGameFirstName() {
    	int min = 0;
    	int max = 8;
    	int randomNum = (int)(Math.random() * (max - min + 1)) + min;
    	
    	firstNames.add("Joker");
    	firstNames.add("Mike");
    	firstNames.add("Bob");
    	firstNames.add("Joe");
    	firstNames.add("Baker");
    	firstNames.add("Jobless");
    	firstNames.add("Mimmie");
    	firstNames.add("Mom");
    	firstNames.add("Sir");
   
    	return firstNames.get(randomNum);
    }
    
    public static String createRandomGameLastName() {

    	int min = 0;
    	int max = 8;
    	
    	int randomNum = (int)(Math.random() * (max - min + 1)) + min;
    	
    	lastNames.add("Boss");
    	lastNames.add("Diaz");
    	lastNames.add("Pompa");
    	lastNames.add("Horse");
    	lastNames.add("Daniel");
    	lastNames.add("Brandon");
    	lastNames.add("Lopez");
    	lastNames.add("Lopeek");
    	lastNames.add("GI Joe");
    	
    	return lastNames.get(randomNum);
    }

    public static String createRandomGameCountryName() {
    	int min = 0;
    	int max = 8;
    	
    	int randomNum = (int)(Math.random() * (max - min + 1)) + min;
    	
    	countryNames.add("America");
    	countryNames.add("England");
    	countryNames.add("Mexico");
    	countryNames.add("Brazil");
    	countryNames.add("Africa");
    	countryNames.add("Canada");
    	countryNames.add("London");
    	countryNames.add("Japan");
    	countryNames.add("Korea");
    	
    	return countryNames.get(randomNum);
    	
    }

    public static GameUserInfo createGameUser(Integer id) {
    	
    	String firstName = createRandomGameFirstName();
    	String lastName = createRandomGameLastName();
    	String countryName = createRandomGameCountryName();
    	
    
    	gameUserInfos.put(id, new GameUserInfo(id, firstName , lastName, countryName));
    	return gameUserInfos.get(id);
    }
}