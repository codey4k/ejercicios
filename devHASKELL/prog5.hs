main :: IO()

main = do
    putStrLn "Cual es tu nombre? "
    name <- getLine
    putStrLn("Hello " ++ name)
