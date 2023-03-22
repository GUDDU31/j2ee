package com.jspiders.musicplayerjdbc.operation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Operation {
	static Connection connection;
	static PreparedStatement  preparedStatement;
	static String dburl="jdbc:mysql://localhost:3306/weja1?user=root&password=GKmysql@1996";
	static String driverpath="com.mysql.cj.jdbc.Driver";
	private static String query;
	private static Scanner scanner=new Scanner(System.in);
	private static  boolean loop;
	private static ResultSet resultSet;

   
	private int songno;
	private String songname;
	private String singername;
	private  String moviename;
	private  double duration;
	
	 public int getSongno() {
			return songno;
		}

		public void setSongno(int songno) {
			this.songno = songno;
		}

		public String getSongname() {
			return songname;
		}

		public void setSongname(String songname) {
			this.songname = songname;
		}

		public String getSingername() {
			return singername;
		}

		public void setSingername(String singername) {
			this.singername = singername;
		}

		public String getMoviename() {
			return moviename;
		}

		public void setMoviename(String moviename) {
			this.moviename = moviename;
		}

		public double getDuration() {
			return duration;
		}

		public void setDuration(double duration) {
			this.duration = duration;
		}
	
	
	public static void conn() {
		
		try {
			Class.forName(driverpath);
			
			connection=DriverManager.getConnection(dburl);
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void close() {
		try {
			if (connection!=null){
			connection.close();
			}
			
			if(preparedStatement!=null) {
				preparedStatement.close();
			}
			if(resultSet!=null) {
				resultSet.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void close1() {
		try {
			if (connection!=null){
			connection.close();
			}
			
			if(preparedStatement!=null) {
				preparedStatement.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	

	
	public static void add() {
		loop=true;
		while(loop)
		{
		conn();
		query="insert into  song values (?,?,?,?)";
		try {
			preparedStatement=connection.prepareStatement(query);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println("enter the song details one by one "
				+ "\nsong no"
				+ "\nsong name"
				+ "\nsinger name"
				+ "\nduration");
		Operation operation=new Operation();
		operation.setSongno(scanner.nextInt());
		scanner.next();
		operation.setSongname(scanner.nextLine());
		operation.setSingername(scanner.nextLine());
		operation.setDuration(scanner.nextDouble());
		try {
			preparedStatement.setInt(1,operation.getSongno());
			preparedStatement.setString(2,operation.getSongname());
			preparedStatement.setString(3,operation.getSingername());
			preparedStatement.setDouble(4,operation.getDuration());
			preparedStatement.executeUpdate();
			System.out.println("song added succesfully");
			System.out.println("============================");
			System.out.println("enter 1 to add another song \nenter 0 to exit");
			if(scanner.nextInt()==1)
			{
				loop=true;
			}
			else {
				loop=false;
			}
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		close1();
		}
	
	}
	
  

public static void updatesong() {
	  playallsong();
	  System.out.println("Enter the song_no to udate the song:");
	    int songNo = scanner.nextInt();
	  
	  try {
		    String query = "SELECT * FROM song WHERE song_no = ?";
		    conn();
		    preparedStatement = connection.prepareStatement(query);
		    
		    preparedStatement.setInt(1, songNo);
		    resultSet = preparedStatement.executeQuery();
		    
		    ArrayList<String> songData = new ArrayList<>();
		    if (resultSet.next()) {
		        songData.add(0,resultSet.getString(1));
		        songData.add(1,resultSet.getString(2));
		        songData.add(2,resultSet.getString(3));
		        songData.add(3,resultSet.getString(4));
		        System.out.println(songData);
		    } else {
		        System.out.println("No song found with song_no = " + songNo);
		    }
		
		    close();
          
		conn();
		query="UPDATE SONG SET SONG_NO=?,songname=?,singername=?,duration=? where song_no=?";
		preparedStatement=connection.prepareStatement(query);
		preparedStatement.setInt(5, songNo);
		System.out.println("1:to update song_no");
		System.out.println("2:to updaate songname");
		System.out.println("3:to update singername");
		System.out.println("4:to update duration");
		int value=scanner.nextInt();
		int update=Integer.valueOf(songData.get(0));
		String songname=songData.get(1);
		String singername=songData.get(2);
		double duration=Double.valueOf(songData.get(3));
		switch (value) {
		case 1:
			System.out.println("enter the song_no");
			update=scanner.nextInt();
			preparedStatement.setInt(1, update);
			preparedStatement.setString(2,songname);
			preparedStatement.setString(3,singername);
			preparedStatement.setDouble(4,duration);
			break;
		case 2:
			System.out.println("enter your new name");
			songname=scanner.next();
			preparedStatement.setInt(1, update);
			preparedStatement.setString(2,songname);
			preparedStatement.setString(3,singername);
			preparedStatement.setDouble(4,duration);
			break;
		case 3:
			System.out.println("enter the singername");
			singername=scanner.next();
			preparedStatement.setInt(1, update);
			preparedStatement.setString(2,songname);
			preparedStatement.setString(3,singername);
			preparedStatement.setDouble(4,duration);
			break;
		case 4:
			System.out.println("enter the updated duration");
			duration=scanner.nextDouble();
			preparedStatement.setInt(1, update);
			preparedStatement.setString(2,songname);
			preparedStatement.setString(3,singername);
			preparedStatement.setDouble(4,duration);
			
			break;

		case 5:
			break;
		}
	preparedStatement.executeUpdate();
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
//	}   
   }

public static void playallsong() {
	
	conn();
	try {
		query="select * from song";
		preparedStatement=connection.prepareStatement(query);
		resultSet=preparedStatement.executeQuery();
		if(!resultSet.next()) {
			System.out.println("no song found");
			
		}else {
		do {
			System.out.println(resultSet.getString(1)+"||"
		              +resultSet.getString(2)+
					"||"+resultSet.getString(3)+
					"||"+resultSet.getString(4)+"||");
		}while(resultSet.next());
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
	close();
}

public static void chooseSong() {
	   
	    playallsong();
	    boolean loop = true;
	    while (loop) {
	        System.out.println("enter the song no to play"+"\n for exit enter 100");
	        int songNo = scanner.nextInt();
	        
	        if (songNo == 100) {
	            loop = false;
	        }
	        
	        else {
	            conn();
	            query = "select * from song where SONG_NO=?";
	            try {
	                preparedStatement = connection.prepareStatement(query);
	                preparedStatement.setInt(1, songNo);
	                resultSet = preparedStatement.executeQuery();
	                if (resultSet.next()) {
	                    System.out.println("Playing song: " + resultSet.getString(2)+"|"+resultSet.getString(3));
	                } else {
	                    System.out.println("Song not found.");
	                }
	            } catch (SQLException e) {
	                e.printStackTrace();
	            } finally {
	                close();
	            }
	        }
	      }//while loop
	}//choose song
 



public static void playrandom() {
    conn();
    try {
        // Retrieve all song IDs from the database
        query = "SELECT song_no FROM song";
        preparedStatement = connection.prepareStatement(query);
        resultSet = preparedStatement.executeQuery();

        // Store the song IDs in an array
        List<Integer> songIds = new ArrayList<>();
        while (resultSet.next()) {
            songIds.add(resultSet.getInt("song_no"));
        }

        // Select a random song ID and retrieve its information from the database
        
        Random random = new Random();
        int count=songIds.size();
        System.out.println(songIds.size());
        int randomSongId = songIds.get(random.nextInt(songIds.size()));
        query = "SELECT * FROM song WHERE song_no = ?";
        preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, randomSongId);
        resultSet = preparedStatement.executeQuery();
        while(resultSet.next()) {
            System.out.println("Playing song: " + resultSet.getString("Songname") + " by " + resultSet.getString("singername"));
        } 

    }catch (SQLException e) {
        e.printStackTrace();
    }
    close();
}


 
 
 public static void removesong() {
	 System.out.println("if do you want to delete \nentire songs then press 1\nif not then press 2");
	 int delete=scanner.nextInt();
     if (delete==1) {
    	 conn();
    	 try {
    		query="truncate table song";
		     preparedStatement=connection.prepareStatement(query);
			 preparedStatement.executeUpdate();
			 System.out.println("all songs are deleted");
			 close1();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
     }else {
    	boolean loop2=true;
    	playallsong();
    	while(loop2) {
		conn();
		query="delete from song where song_no=?";
		try {
			preparedStatement=connection.prepareStatement(query);
			System.out.println("enter the song no");
			delete=scanner.nextInt();
			preparedStatement.setInt(1, delete);
			preparedStatement.executeUpdate();
			System.out.println("the song no "+ delete+" deleted succesfully");
			close1();
			System.out.println("press 0 to exit ");
			delete=scanner.nextInt();
			if(delete==0) {
				loop2=false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	}
	}
 }

}
