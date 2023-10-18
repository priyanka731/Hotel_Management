# Hotel_Management
This is Hotel_Management application where I have performed crud operation like get , post , put, delete api and with the help of this crud operation .I can manage all the things of Hotel.
# Dependencies
* SpringBoot Starter Web
* Lombok
* JPA
* H2_Database
## Data Flow
#### model
* Room
* Type

### controller
* @GetMapping("rooms")
* @GetMapping("rooms/id/{id}")
* @GetMapping("rooms/price/{price}")
* @GetMapping("rooms/price/{price}/and/available")
* @GetMapping("rooms/price/{price}/or/available")
* @GetMapping("rooms/AC/or/available")
* @PostMapping("room")
* @PostMapping("rooms")
* @DeleteMapping("rooms/ids")

### service
* RoomService
### repository
* IRoomRepo
  
## Project Summary
In this application we can Create Read Update Delete Hotel Rooms from the different api that are in this application
