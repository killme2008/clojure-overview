;;seqs1
(println (take 9 (cycle [1 2 3])))
(println (interleave [:a :b :c :d :e] [1 2 3 4 5]))
(println (partition 3 (range 1 10)))
(println (map vector [:a :b :c :d :e] [1 2 3 4 5]))
(println (apply str (interpose \, "asdf")))
(println (reduce + (range 0 11)))