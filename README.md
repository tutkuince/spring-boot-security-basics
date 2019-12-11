# Spring Security


#### Authentication

Authentication is about validating the identity of a client attempting to call a web service. Typically, identity is validated with user credentials, such as a user name and password.

#### Authorization

Authorization is the next step after authentication. So once a client is authenticated (they have proven who they are), what do they have access to? For example, what data can they view, are they allowed to change that data, etc.

'**API Key**' and '**Username** and **password**' identify TWO ways to authenticate with a web service.



**Basic Authentication** (also referred to as Basic Auth) is the simplest protocol available for performing web service authentication over HTTP protocol. 
Basic Auth requires a **username** and **password**. The client calling the web service takes these two credentials, 
converts them to a single **Base 64–encoded** value and passes it along in the **Authentication HTTP header**.

The server compares the credentials passed to those stored. 
If it matches, the server fulfills the request and provides access to the data. 
If the Authentication HTTP header is missing or the password does not match the user name, 
the server denies access and returns a **401 status code**, which means the request is Unauthorized.

**Extend WebSecurityConfigurerAdapter** override the default security and provide your own configuration.