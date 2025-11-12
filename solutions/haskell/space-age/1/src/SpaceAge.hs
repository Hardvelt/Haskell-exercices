module SpaceAge (Planet(..), ageOn) where

data Planet = Mercury
            | Venus
            | Earth
            | Mars
            | Jupiter
            | Saturn
            | Uranus
            | Neptune
            
conversion :: Planet -> Float
conversion Mercury = 0.2408467
conversion Venus = 0.61519726
conversion Earth = 1.0
conversion Mars = 1.8808158
conversion Jupiter = 11.862615
conversion Saturn = 29.447498
conversion Uranus = 84.016846
conversion Neptune = 164.79132

ageOn :: Planet -> Float -> Float
ageOn planet seconds = (seconds/conversion planet)/31557600 
