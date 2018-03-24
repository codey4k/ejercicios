main :: IO()

main = do
    putStrLn "Dame un numero entero "
    n <- getLine
    let numero = (read n :: Int)
    print n
