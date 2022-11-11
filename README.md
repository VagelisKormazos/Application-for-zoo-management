# Application-for-zoo-management
For this project you will need to implement a Java Console Application for zoo management, where animals will essentially be recorded.

The generated list will be saved when the program is closed (data that has been loaded/modified will not be lost). Saving the data does NOT have to be done in DB, you can use either direct saving to file/files, or the Java Serialization mechanism (again with files).

Specifically your application will support the following functions as menu options:
1. View all available zoo animals
2. Add a new animal (to an existing category)
3. Search for an animal by name
4. Search for an animal by code
5. Deleting an animal by code
6. Feeding the animals (simulated feeding with some messages on the screen)
7. Exit from the application
For each new animal, the fields to be saved should be the following:
- Code
- Name of the animal
- Weight (average weight)
- Max Age (average maximum age of the animal).
- Optionally you can enter other information if you wish
