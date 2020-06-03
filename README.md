# oauth2-server-spring-demo
A simple implementation of an OAuth2 server in spring
# Instructions
- Request authorization server HOST:PORT/oauth/token
  - basic auth
    - user: MyFirstClientId
    - password: MyFirstClientSecret
  - body (form-data) 
    - grant_type:password
    - username:sean
    - password:sean-qwerty
- Use retrieved token to request any endpoint in resource server
