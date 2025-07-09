# Build
To build client application run
````bash
mvn clean package
````
# Run
To run the konivin client:

````bash
java -jar target/konivin-shell-1.1.1.jar
````
# Client shell usage
After running java command the program shows this prompt:
````
shell:>
````
# Shell Help command
````
shell:>help
AVAILABLE COMMANDS

Built-In Commands
       help: Display help about available commands
       stacktrace: Display the full stacktrace of the last error.
       clear: Clear the shell screen.
       quit, exit: Exit the shell.
       history: Display or save the history of previously run commands
       version: Show version info
       script: Read and execute commands from a file.

Konivin Commands
       consultar: Performs a query to the Konivin persons API.
````
# Consultar command help
````
shell:>help consultar
NAME
       consultar - Performs a query to the Konivin persons API.

SYNOPSIS
       consultar --lcy String --jor String --vpv String --icf String --thy String --klm String --hgu String --hho String --method String --server String --help

OPTIONS
       --lcy String
       Username performing the query.
       [Optional]

       --jor String
       Query codes, separated by commas.
       [Optional]

       --vpv String
       User's password.
       [Optional]

       --icf String
       Document type (e.g., '01' for ID Card in Colombia).
       [Optional]

       --thy String
       Country of the query (ISO 3166-1 alpha-2, e.g., 'co').
       [Optional]

       --klm String
       Document number to query.
       [Optional]

       --hgu String
       Date for queries that require it (format:YYYY-MM-DD).
       [Optional, default = 1900-01-01]

       --hho String
       6-character vehicle plate (no spaces or hyphens).
       [Optional]

       --method String
       HTTP method to use (GET or POST).
       [Optional, default = GET]

       --server String
       Index of the server URL to query (provided by the Konivin team)
       [Optional]

       --help or -h
       help for consultar
       [Optional]
````
The explanation of each parameter can be found in:
[Manual fuentes Konivin](https://produccion.konivin.com:28183/konivin/vs/documentacion/DetalleFuentes.xhtml)
# Example consuming Konivin
This is an example for consuming Konivin
````
consultar --lcy "${user}" --jor "23566548" --vpv "${password}" --icf "01" --thy "co" --klm "ND1098XX" --hho "123456" --servidor "${endpoint}" --metodo "GET"
````
Please replace the ${values} to real values provided by Konivin support team.
