main :: IO ()

main = do 
        c <- getChar
        if c == 'y' 
          then putStrLn "Positivo" 
          else putStrLn "Negativo"
