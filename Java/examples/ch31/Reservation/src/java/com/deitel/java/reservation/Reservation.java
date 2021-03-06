// Fig. 28.17: Reservation.java
// Airline reservation web service.
package com.deitel.java.reservation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService( name = "Reservation", serviceName = "ReservationService" )
public class Reservation
{
   private static final String DATABASE_URL =
      "jdbc:derby://localhost:1527/Reservation";
   private static final String USERNAME = "test";
   private static final String PASSWORD = "test";
   private Connection connection;
   private PreparedStatement lookupSeat;
   private PreparedStatement reserveSeat;

   // a WebMethod that can reserve a seat
   @WebMethod( operationName = "reserve" )
   public boolean reserve( @WebParam( name = "seatType" ) String seatType,
      @WebParam( name = "classType" ) String classType )
   {
      try
      {
         connection = DriverManager.getConnection(
            DATABASE_URL, USERNAME, PASSWORD );
         lookupSeat = connection.prepareStatement(
            "SELECT \"number\" FROM \"seats\" WHERE (\"taken\" = 0) " +
            "AND (\"location\" = ?) AND (\"class\" = ?)" );
         lookupSeat.setString( 1, seatType );
         lookupSeat.setString( 2, classType );
         ResultSet resultSet = lookupSeat.executeQuery();

         // if requested seat is available, reserve it
         if ( resultSet.next() )
         {
            int seat = resultSet.getInt( 1 );
            reserveSeat = connection.prepareStatement(
               "UPDATE \"seats\" SET \"taken\"=1 WHERE \"number\"=?" );
            reserveSeat.setInt( 1, seat );
            reserveSeat.executeUpdate();
            return true;
         } // end if

         return false;
      } // end try
      catch ( SQLException e )
      {
         e.printStackTrace();
         return false;
      } // end catch
      catch ( Exception e )
      {
         e.printStackTrace();
         return false;
      } // end catch
      finally
      {
         try
         {
            lookupSeat.close();
            reserveSeat.close();
            connection.close();
         } // end try
         catch ( Exception e )
         {
            e.printStackTrace();
            return false;
         } // end catch
      } // end finally
   } // end WebMethod reserve
} // end class Reservation

/**************************************************************************
 * (C) Copyright 1992-2009 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/


