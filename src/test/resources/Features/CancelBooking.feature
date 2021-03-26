Feature: Verifying Adactin Hotel Application
	@reg9
  Scenario Outline: Verifying Booking Details and Cancel Booking
    Given user Should Login With Login Credentials "<UserName>" and "<PassWord>"
    When User Should Enter The Booking Details "<Location>","<Hotels>","<RoomType>","<NoOfRooms>","<CheckInDate>","<CheckOutDate>","<AdultsPerRoom>","<ChildrensPerRoom>"
    And User Should Select the hotel Page
    And User Should Enter Personal and Payment Details and User Should Get A Order Id "<FirstName>","<LastName>","<Address>","<CardNumber>","<CardType>","<CardMonth>","<CardYear>","<Cvv>"
   	And User Should Navigate To cancel Booking 
    And User Should Search The Booking Id "<BookingId>"
    And User Select the Booking Id and Cancel button
    And User Should Verify Sucessfully Cancel the Booking
   
   

    Examples: 
      | UserName     | PassWord     | Location | Hotels      | RoomType | NoOfRooms | CheckInDate | CheckOutDate | AdultsPerRoom | ChildrensPerRoom | FirstName | LastName  | Address | CardNumber       | CardType         | CardMonth | CardYear | Cvv |
      | rajasekar144 | 820613106059 | Sydney   | Hotel Creek | Double   | 1 - One   | 22/03/2021  | 23/03/2021   | 2 - Two       | 2 - Two          | Rajsekar  | SekarRaja | Chennai | 1234567890901234 | American Express | February  |     2012 | 123 |
      
      @sanity1
	Scenario Outline: Verifying Booking Details and Cancel Booking
    Given user Should Login With Login Credentials "<UserName>" and "<PassWord>"
    When User Should Navigate To cancel Booking and cancel oredr Id
    Then Verify the cancellation
  
    
    
    Examples:
    
    | UserName     | PassWord     |BookingId|
    | rajasekar144 | 820613106059 |GTT4A437EC|