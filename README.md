Employee Attendance Tracker – How to Run

Open the backend folder in your IDE and make sure JDK 17 and Maven are installed. Update the MySQL username and password in the application.properties file, then run the backend using mvn spring-boot:run. The backend will start on http://localhost:8080.

Next, open the frontend folder and run npm install to install all dependencies. Start the frontend using npm run dev, and it will run on http://localhost:5173. Ensure that the API link in the frontend configuration points to http://localhost:8080 so that both the frontend and backend are connected properly.
