import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
public class DbFunction {
    public Connection connect() {
        Connection con;
        try {
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Zoo", "postgres", "admin");
            if(con == null)
                System.out.println("Failed to make connection!");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return con;
    }

    public void insertAnimal(String name, int age, String breed, boolean needFoodOrWater, int healthCareValability) {
        Connection con = connect();
        String insertSQL = "INSERT INTO ANIMAL VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement pstmt = con.prepareStatement(insertSQL)) {
            pstmt.setString(1, name);
            pstmt.setInt(2, age);
            pstmt.setString(3, breed);
            pstmt.setBoolean(4, needFoodOrWater);
            pstmt.setInt(5, healthCareValability);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                con.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void createTableAnimal() {
        Connection con = connect();
        String createTableSQL = "CREATE TABLE IF NOT EXISTS ANIMAL (name VARCHAR(200), age INTEGER, breed VARCHAR(200), needFoodOrWater BOOLEAN, healthCareValability INTEGER)";
        try (PreparedStatement pstmt = con.prepareStatement(createTableSQL)) {
            pstmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                con.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void showAnimals(String value) throws SQLException {
        Connection con = connect();
        try{
            PreparedStatement stmt = con.prepareStatement("SELECT * FROM ANIMAL WHERE name = ?");
            stmt.setString(1, value);
            ResultSet rs = stmt.executeQuery();
            while(rs.next())
                System.out.println(rs.getString(1) + " " + rs.getInt(2) + " " + rs.getString(3) + " " + rs.getBoolean(4) + " " + rs.getInt(5));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                con.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void deleteAnimal(String name) {
        Connection con = connect();
        try{
            PreparedStatement stmt = con.prepareStatement("DELETE FROM ANIMAL WHERE name = ?");
            stmt.setString(1, name);
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                con.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void updateAnimal(String name, int age, String breed, boolean needFoodOrWater, int healthCareValability)
    {
        Connection con = connect();
        try {
            PreparedStatement stmt = con.prepareStatement("UPDATE ANIMAL SET age = ?, breed = ?, needFoodOrWater = ?, healthCareValability = ? WHERE name = ?");
            stmt.setInt(1, age);
            stmt.setString(2, breed);
            stmt.setBoolean(3, needFoodOrWater);
            stmt.setInt(4, healthCareValability);
            stmt.setString(5, name);
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                con.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void createTableInvertebrate() {
        Connection con = connect();
        try {
            PreparedStatement stmt = con.prepareStatement("CREATE TABLE IF NOT EXISTS INVERTEBRATE (name VARCHAR(200), age INTEGER, breed VARCHAR(200), needFoodOrWater BOOLEAN, healthCareValability INTEGER, fly BOOLEAN, foodType VARCHAR(200))");
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void insertInvertebrate(String name, int age, String breed, boolean needFoodOrWater, int healthCareValability, boolean fly, String foodType) {
        Connection con = connect();
        String insertSQL = "INSERT INTO INVERTEBRATE VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement pstmt = con.prepareStatement(insertSQL)) {
            pstmt.setString(1, name);
            pstmt.setInt(2, age);
            pstmt.setString(3, breed);
            pstmt.setBoolean(4, needFoodOrWater);
            pstmt.setInt(5, healthCareValability);
            pstmt.setBoolean(6, fly);
            pstmt.setString(7, foodType);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                con.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void updateInvertebrate(String name, int age, String breed, boolean needFoodOrWater, int healthCareValability, boolean fly, String foodType)
    {
        Connection con = connect();
        try {
            PreparedStatement stmt = con.prepareStatement("UPDATE INVERTEBRATE SET age = ?, breed = ?, needFoodOrWater = ?, healthCareValability = ?, fly = ?, foodType = ? WHERE name = ?");
            stmt.setInt(1, age);
            stmt.setString(2, breed);
            stmt.setBoolean(3, needFoodOrWater);
            stmt.setInt(4, healthCareValability);
            stmt.setBoolean(5, fly);
            stmt.setString(6, foodType);
            stmt.setString(7, name);
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                con.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void showInvertebrates(String value)
    {
        Connection con = connect();
        try {
            PreparedStatement stmt = con.prepareStatement("SELECT * FROM INVERTEBRATE WHERE name = ?");
            stmt.setString(1, value);
            ResultSet rs = stmt.executeQuery();
            while(rs.next())
                System.out.println(rs.getString(1) + " " + rs.getInt(2) + " " + rs.getString(3) + " " + rs.getBoolean(4) + " " + rs.getInt(5) + " " + rs.getBoolean(6) + " " + rs.getString(7));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void deleteInvertebrate(String name)
    {
        Connection con = connect();
        try {
            PreparedStatement stmt = con.prepareStatement("DELETE FROM INVERTEBRATE WHERE name = ?");
            stmt.setString(1, name);
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void createTableAmphibian() {
        Connection con = connect();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("CREATE TABLE IF NOT EXISTS AMPHIBIAN (name VARCHAR(200), age INTEGER, breed VARCHAR(200), needFoodOrWater BOOLEAN, healthCareValability INTEGER, skinType VARCHAR(200), skinColor VARCHAR(200))");
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                stmt.close();
                con.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void updateAmphibian(String name, int age, String breed, boolean needFoodOrWater, int healthCareValability, String skinType, String skinColor)
    {
        Connection con = connect();
        try {
            PreparedStatement stmt = con.prepareStatement("UPDATE AMPHIBIAN SET age = ?, breed = ?, needFoodOrWater = ?, healthCareValability = ?, skinType = ?, skinColor = ? WHERE name = ?");
            stmt.setInt(1, age);
            stmt.setString(2, breed);
            stmt.setBoolean(3, needFoodOrWater);
            stmt.setInt(4, healthCareValability);
            stmt.setString(5, skinType);
            stmt.setString(6, skinColor);
            stmt.setString(7, name);
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                con.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void insertAmphibian(String name, int age, String breed, boolean needFoodOrWater, int healthCareValability, String skinType, String skinColor) {
        Connection con = connect();
        String insertSQL = "INSERT INTO AMPHIBIAN VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement pstmt = con.prepareStatement(insertSQL)) {
            pstmt.setString(1, name);
            pstmt.setInt(2, age);
            pstmt.setString(3, breed);
            pstmt.setBoolean(4, needFoodOrWater);
            pstmt.setInt(5, healthCareValability);
            pstmt.setString(6, skinType);
            pstmt.setString(7, skinColor);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                con.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void deleteAmphibian(String name){
        Connection con = connect();
        try {
            PreparedStatement stmt = con.prepareStatement("DELETE FROM AMPHIBIAN WHERE name = ?");
            stmt.setString(1, name);
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                con.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        }
    }
    public void createTableBird() {
        Connection con = connect();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("CREATE TABLE IF NOT EXISTS BIRD (name VARCHAR(200), age INTEGER, breed VARCHAR(200), needFoodOrWater BOOLEAN, healthCareValability INTEGER, fly BOOLEAN, maxAltitude INTEGER, chirps BOOLEAN,wingsColor VARCHAR(200))");
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                stmt.close();
                con.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void insertBird(String name, int age, String breed, boolean needFoodOrWater, int healthCareValability, boolean fly, int maxAltitude, boolean chirps, String wingsColor) {
        Connection con = connect();
        String insertSQL = "INSERT INTO BIRD VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement pstmt = con.prepareStatement(insertSQL)) {
            pstmt.setString(1, name);
            pstmt.setInt(2, age);
            pstmt.setString(3, breed);
            pstmt.setBoolean(4, needFoodOrWater);
            pstmt.setInt(5, healthCareValability);
            pstmt.setBoolean(6, fly);
            pstmt.setInt(7, maxAltitude);
            pstmt.setBoolean(8, chirps);
            pstmt.setString(9, wingsColor);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                con.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void deleteBird(String name){
        Connection con = connect();
        try {
            PreparedStatement stmt = con.prepareStatement("DELETE FROM BIRD WHERE name = ?");
            stmt.setString(1, name);
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                con.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        }
    }
    public void updateBird(String name, int age, String breed, boolean needFoodOrWater, int healthCareValability, boolean fly, int maxAltitude, boolean chirps, String wingsColor)
    {
        Connection con = connect();
        try {
            PreparedStatement stmt = con.prepareStatement("UPDATE BIRD SET age = ?, breed = ?, needFoodOrWater = ?, healthCareValability = ?, fly = ?, maxAltitude = ?, chirps = ?, wingsColor = ? WHERE name = ?");
            stmt.setInt(1, age);
            stmt.setString(2, breed);
            stmt.setBoolean(3, needFoodOrWater);
            stmt.setInt(4, healthCareValability);
            stmt.setBoolean(5, fly);
            stmt.setInt(6, maxAltitude);
            stmt.setBoolean(7, chirps);
            stmt.setString(8, wingsColor);
            stmt.setString(9, name);
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                con.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void createTableMammal() {
        Connection con = connect();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("CREATE TABLE IF NOT EXISTS MAMMAL (name VARCHAR(200), age INTEGER, breed VARCHAR(200), needFoodOrWater BOOLEAN, healthCareValability INTEGER, comunicateBySounds BOOLEAN, inteligence INTEGER, foodType VARCHAR(200), hair BOOLEAN)");
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                stmt.close();
                con.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void insertMammal(String name, int age, String breed, boolean needFoodOrWater, int healthCareValability, boolean comunicateBySounds, int inteligence, String foodType, boolean hair) {
        Connection con = connect();
        String insertSQL = "INSERT INTO MAMMAL VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement pstmt = con.prepareStatement(insertSQL)) {
            pstmt.setString(1, name);
            pstmt.setInt(2, age);
            pstmt.setString(3, breed);
            pstmt.setBoolean(4, needFoodOrWater);
            pstmt.setInt(5, healthCareValability);
            pstmt.setBoolean(6, comunicateBySounds);
            pstmt.setInt(7, inteligence);
            pstmt.setString(8, foodType);
            pstmt.setBoolean(9, hair);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                con.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void deleteMammal(String name){
        Connection con = connect();
        try {
            PreparedStatement stmt = con.prepareStatement("DELETE FROM MAMMAL WHERE name = ?");
            stmt.setString(1, name);
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                con.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        }
    }
    public void updateMammal(String name, int age, String breed, boolean needFoodOrWater, int healthCareValability, boolean comunicateBySounds, int inteligence, String foodType, boolean hair)
    {
        Connection con = connect();
        try {
            PreparedStatement stmt = con.prepareStatement("UPDATE MAMMAL SET age = ?, breed = ?, needFoodOrWater = ?, healthCareValability = ?, comunicateBySounds = ?, inteligence = ?, foodType = ?, hair = ? WHERE name = ?");
            stmt.setInt(1, age);
            stmt.setString(2, breed);
            stmt.setBoolean(3, needFoodOrWater);
            stmt.setInt(4, healthCareValability);
            stmt.setBoolean(5, comunicateBySounds);
            stmt.setInt(6, inteligence);
            stmt.setString(7, foodType);
            stmt.setBoolean(8, hair);
            stmt.setString(9, name);
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                con.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void createTableReptile() {

        Connection con = connect();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("CREATE TABLE IF NOT EXISTS REPTILE (name VARCHAR(200), age INTEGER, breed VARCHAR(200), needFoodOrWater BOOLEAN, healthCareValability INTEGER, swim BOOLEAN, color VARCHAR(200), poisonous BOOLEAN)");
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                stmt.close();
                con.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void insertReptile(String name, int age, String breed, boolean needFoodOrWater, int healthCareValability, boolean swim, String color, boolean poisonous) {
        Connection con = connect();
        String insertSQL = "INSERT INTO REPTILE VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement pstmt = con.prepareStatement(insertSQL)) {
            pstmt.setString(1, name);
            pstmt.setInt(2, age);
            pstmt.setString(3, breed);
            pstmt.setBoolean(4, needFoodOrWater);
            pstmt.setInt(5, healthCareValability);
            pstmt.setBoolean(6, swim);
            pstmt.setString(7, color);
            pstmt.setBoolean(8, poisonous);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                con.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void deleteReptile(String name){
        Connection con = connect();
        try {
            PreparedStatement stmt = con.prepareStatement("DELETE FROM REPTILE WHERE name = ?");
            stmt.setString(1, name);
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                con.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        }
    }
    public void updateReptile(String name, int age, String breed, boolean needFoodOrWater, int healthCareValability, boolean swim, String color, boolean poisonous)
    {
        Connection con = connect();
        try {
            PreparedStatement stmt = con.prepareStatement("UPDATE REPTILE SET age = ?, breed = ?, needFoodOrWater = ?, healthCareValability = ?, swim = ?, color = ?, poisonous = ? WHERE name = ?");
            stmt.setInt(1, age);
            stmt.setString(2, breed);
            stmt.setBoolean(3, needFoodOrWater);
            stmt.setInt(4, healthCareValability);
            stmt.setBoolean(5, swim);
            stmt.setString(6, color);
            stmt.setBoolean(7, poisonous);
            stmt.setString(8, name);
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                con.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void createTableFish() {
        Connection con = connect();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("CREATE TABLE IF NOT EXISTS FISH (name VARCHAR(200), age INTEGER, breed VARCHAR(200), needFoodOrWater BOOLEAN, healthCareValability INTEGER, predator BOOLEAN, length INTEGER, waterType VARCHAR(200), maxDepth INTEGER)");
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                stmt.close();
                con.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void insertFish(String name, int age, String breed, boolean needFoodOrWater, int healthCareValability, boolean predator, int length, String waterType, int maxDepth) {
        Connection con = connect();
        String insertSQL = "INSERT INTO FISH VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement pstmt = con.prepareStatement(insertSQL)) {
            pstmt.setString(1, name);
            pstmt.setInt(2, age);
            pstmt.setString(3, breed);
            pstmt.setBoolean(4, needFoodOrWater);
            pstmt.setInt(5, healthCareValability);
            pstmt.setBoolean(6, predator);
            pstmt.setInt(7, length);
            pstmt.setString(8, waterType);
            pstmt.setInt(9, maxDepth);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                con.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void deleteFish(String name){
        Connection con = connect();
        try {
            PreparedStatement stmt = con.prepareStatement("DELETE FROM FISH WHERE name = ?");
            stmt.setString(1, name);
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                con.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        }
    }
    public void updateFish(String name, int age, String breed, boolean needFoodOrWater, int healthCareValability, boolean predator, int length, String waterType, int maxDepth)
    {
        Connection con = connect();
        try {
            PreparedStatement stmt = con.prepareStatement("UPDATE FISH SET age = ?, breed = ?, needFoodOrWater = ?, healthCareValability = ?, predator = ?, length = ?, waterType = ?, maxDepth = ? WHERE name = ?");
            stmt.setInt(1, age);
            stmt.setString(2, breed);
            stmt.setBoolean(3, needFoodOrWater);
            stmt.setInt(4, healthCareValability);
            stmt.setBoolean(5, predator);
            stmt.setInt(6, length);
            stmt.setString(7, waterType);
            stmt.setInt(8, maxDepth);
            stmt.setString(9, name);
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                con.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void showAllAmphibians() {
        Connection con = connect();
        try {
            PreparedStatement stmt = con.prepareStatement("SELECT * FROM AMPHIBIAN");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("name") + " " + rs.getInt("age") + " " + rs.getString("breed") + " " + rs.getBoolean("needFoodOrWater") + " " + rs.getInt("healthCareValability") + " " + rs.getString("skinType") + " " + rs.getString("skinColor"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                con.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void showAllReptiles() {
        Connection con = connect();
        try {
            PreparedStatement stmt = con.prepareStatement("SELECT * FROM REPTILE");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("name") + " " + rs.getInt("age") + " " + rs.getString("breed") + " " + rs.getBoolean("needFoodOrWater") + " " + rs.getInt("healthCareValability") + " " + rs.getBoolean("swim") + " " + rs.getString("color") + " " + rs.getBoolean("poisonous"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                con.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void showAllFishes() {
        Connection con = connect();
        try {
            PreparedStatement stmt = con.prepareStatement("SELECT * FROM FISH");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("name") + " " + rs.getInt("age") + " " + rs.getString("breed") + " " + rs.getBoolean("needFoodOrWater") + " " + rs.getInt("healthCareValability") + " " + rs.getBoolean("predator") + " " + rs.getInt("length") + " " + rs.getString("waterType") + " " + rs.getInt("maxDepth"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                con.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void showAllMammals() {
        Connection con = connect();
        try {
            PreparedStatement stmt = con.prepareStatement("SELECT * FROM MAMMAL");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("name") + " " + rs.getInt("age") + " " + rs.getString("breed") + " " + rs.getBoolean("needFoodOrWater") + " " + rs.getInt("healthCareValability") + " " + rs.getBoolean("comunicateBySounds") + " " + rs.getInt("inteligence") + " " + rs.getString("foodType") + " " + rs.getBoolean("hair"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                con.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void showAllBirds() {
        Connection con = connect();
        try {
            PreparedStatement stmt = con.prepareStatement("SELECT * FROM BIRD");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("name") + " " + rs.getInt("age") + " " + rs.getString("breed") + " " + rs.getBoolean("needFoodOrWater") + " " + rs.getInt("healthCareValability") + " " + rs.getInt("maxAltitude") + " " + rs.getBoolean("chirps") + " " + rs.getBoolean("fly") + " " + rs.getString("wingsColor"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                con.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void showAllInvertebrates() {
        Connection con = connect();
        try {
            PreparedStatement stmt = con.prepareStatement("SELECT * FROM INVERTEBRATE");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("name") + " " + rs.getInt("age") + " " + rs.getString("breed") + " " + rs.getBoolean("needFoodOrWater") + " " + rs.getInt("healthCareValability") + " " + rs.getBoolean("fly") + " " + rs.getString("foodType"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                con.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void showAmphibians(String name) {
        Connection con = connect();
        try {
            PreparedStatement stmt = con.prepareStatement("SELECT * FROM AMPHIBIAN WHERE name = ?");
            stmt.setString(1, name);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("name") + " " + rs.getInt("age") + " " + rs.getString("breed") + " " + rs.getBoolean("needFoodOrWater") + " " + rs.getInt("healthCareValability") + " " + rs.getString("skinType") + " " + rs.getString("skinColor"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void showReptiles(String name) {
        Connection con = connect();
        try {
            PreparedStatement stmt = con.prepareStatement("SELECT * FROM REPTILE WHERE name = ?");
            stmt.setString(1, name);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("name") + " " + rs.getInt("age") + " " + rs.getString("breed") + " " + rs.getBoolean("needFoodOrWater") + " " + rs.getInt("healthCareValability") + " " + rs.getBoolean("swim") + " " + rs.getString("color") + " " + rs.getBoolean("poisonous"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void showFishes(String name) {
        Connection con = connect();
        try {
            PreparedStatement stmt = con.prepareStatement("SELECT * FROM FISH WHERE name = ?");
            stmt.setString(1, name);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("name") + " " + rs.getInt("age") + " " + rs.getString("breed") + " " + rs.getBoolean("needFoodOrWater") + " " + rs.getInt("healthCareValability") + " " + rs.getBoolean("predator") + " " + rs.getInt("length") + " " + rs.getString("waterType") + " " + rs.getInt("maxDepth"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void showMammals(String name) {
        Connection con = connect();
        try {
            PreparedStatement stmt = con.prepareStatement("SELECT * FROM MAMMAL WHERE name = ?");
            stmt.setString(1, name);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("name") + " " + rs.getInt("age") + " " + rs.getString("breed") + " " + rs.getBoolean("needFoodOrWater") + " " + rs.getInt("healthCareValability") + " " + rs.getBoolean("comunicateBySounds") + " " + rs.getInt("inteligence") + " " + rs.getString("foodType") + " " + rs.getBoolean("hair"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void showBirds(String name) {
        Connection con = connect();
        try {
            PreparedStatement stmt = con.prepareStatement("SELECT * FROM BIRD WHERE name = ?");
            stmt.setString(1, name);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("name") + " " + rs.getInt("age") + " " + rs.getString("breed") + " " + rs.getBoolean("needFoodOrWater") + " " + rs.getInt("healthCareValability") + " " + rs.getInt("maxAltitude") + " " + rs.getBoolean("chirps") + " " + rs.getBoolean("fly") + " " + rs.getString("wingsColor"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}