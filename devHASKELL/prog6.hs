main :: IO()
parimpar :: Int -> String

parimpar n =
    if mod n 2 == 0
        then "es par"
        else "es impar"

main = do
    putStrLn "Dame un numero"
    n <- getLine
    let parametro = (read n :: Int)
    
    print(parimpar parametro)