Feature: Verifying Adactin Hotel Application

  @smokes1
  Scenario Outline: Verifying Booking Details and Cancel Booking
    Given user Should Login With Login Credentials "<UserName>" and "<PassWord>"
    When User Should Enter The Booking Details "<Location>","<Hotels>","<RoomType>","<NoOfRooms>","<CheckInDate>","<CheckOutDate>","<AdultsPerRoom>","<ChildrensPerRoom>"

    Examples: 
      | UserName     | PassWord     | Location | Hotels      | RoomType | NoOfRooms | CheckInDate | CheckOutDate | AdultsPerRoom | ChildrensPerRoom |
      | rajasekar144 | 820613106059 | Sydney   | Hotel Creek | Double   | 1 - One   | 22/03/2021  | 23/03/2021   | 2 - Two       | 2 - Two          |

  @smokes2
  Scenario Outline: Verifying Booking Details With Mandatory
    Given user Should Login With Login Credentials "<UserName>" and "<PassWord>"
    When User Should Enter The Booking Details "<Location>","<NoOfRooms>","<CheckInDate>","<CheckOutDate>","<AdultsPerRoom>"

    Examples: 
      | UserName     | PassWord     | Location | NoOfRooms | CheckInDate | CheckOutDate | AdultsPerRoom |
      | rajasekar144 | 820613106059 | Sydney   | 1 - One   | 22/03/2021  | 23/03/2021   | 2 - Two       |

  @smokes3
  Scenario Outline: Verifying Booking Details Changeing with CheckIn and CheckOut Dates
    Given user Should Login With Login Credentials "<UserName>" and "<PassWord>"
    When User Should Enter The Booking Details "<Location>","<Hotels>","<RoomType>","<NoOfRooms>","<CheckInDate>","<CheckOutDate>","<AdultsPerRoom>","<ChildrensPerRoom>"
    Then User Enter The Search Button

    Examples: 
      | UserName     | PassWord     | Location | Hotels      | RoomType | NoOfRooms | CheckInDate | CheckOutDate | AdultsPerRoom | ChildrensPerRoom |
      | rajasekar144 | 820613106059 | Sydney   | Hotel Creek | Double   | 1 - One   | 22/05/2021  | 23/03/2021   | 2 - Two       | 2 - Two          |

  @smokes4
  Scenario Outline: Verifying Booking Details With Location
    Given user Should Login With Login Credentials "<UserName>" and "<PassWord>"
    When User Should Enter The Booking Detail "<Location>"
    Then User  Should Enter The Search Button 
    Examples: 
      | UserName     | PassWord     | Location |
      | rajasekar144 | 820613106059 | Sydney   |
