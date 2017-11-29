(ns Main)
(println (+ 5 6))
(def a 10)
(def b 20)                                                  ;NameSpace global Variables
(def c 5)
(println (* (+ a b) (+ c (- b)))) ; (a + b) * (c - b)

(let [a 10 b 20 c 5])                                       ; Temporary values

(println (even? 10))
(println (float 3)) ;Casting
;(str) ; concatenation

(def my-set #{1 2 3 4 5})
(def my-smaller-set #{2 3 4})  ;hash sets
;(def my-map ("a" 1 "b" 2)) ;hash maps

(defn double-it "doubles the number" [a] (+ a a))
(println (double-it 4))

(def myList '(1 2 3 4 5))
(println (map double-it myList)) ;Higher order functions
(println (filter even? myList))
(defn rorys-sum [x y] (+ x y))
(println (reduce rorys-sum 0 myList)) ;didn't like aposts

(if()()) ; Control flow statements
(dotimes [x 10]())
(loop [x 10]()())

(println (slurp "Interesting.txt")) ;File manipulation
(spit "Greeting.txt" "Hello") ;Creates new file with the following string
