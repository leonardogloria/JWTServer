package jwtserver

import io.jsonwebtoken.Jwts

class AuthenticatorFilters {

    def filters = {
        all(controller:'restaurante', action:'restaurantes') {
            before = {
                def token =  request.getHeader('X-Auth-Token')
                def userId = 0
                if(token){

                    userId=Jwts.parser().setSigningKey("Bugala").parseClaimsJws(token)?.getBody()?.getIssuer()
                }

                if(Usuario.get(userId)){
                    true
                }else{
                    redirect controller: 'restaurante', action: 'forbiden'
                }


            }
            after = { Map model ->

            }
            afterView = { Exception e ->

            }
        }
    }
}
