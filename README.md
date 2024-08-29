conv -> config -> impl

restful: interface que dois sistemas usam pra trocar informações de forma segura pela internet.


STATUS CODE
- Success
	* 200: OK
	* 201: Created
	* 204: No content

- Redirection
    * 301: Moved Permanently
    * 307: Temporary Redirect
    * 308: Permanent Redirect

- Client Errors
    * 400: Bad Request
    * 401: Unauthorized
    * 404: Not Found
- Server Error
    * 500: Internal Server Error
    * 502: Bad Gateway

Request -> Response

Controller:
    - Ponto de entrada da aplicação