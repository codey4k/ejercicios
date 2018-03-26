main :: IO()

-- saludo :: String -> String
saludo n =
    putStrLn $ "Hola " ++ n

main = do
    putStrLn "Cual es tu nombre?"
    name <- getLine
    let nombre = (read name :: String)
    saludo nombre