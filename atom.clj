;;define atom
(def mem (atom {}))

;;deference
(println @mem)

;;reset!
(reset! mem {:a 1})
(println @mem)

;;swap!
(swap! mem assoc :b 2)
(println @mem)

;;compare-and-set!
(compare-and-set! mem @mem  {:c 3})
(println @mem)

;;memoize
(defn echo
  [value]
  (println "invoke test")
  value)

(def mem-echo
  (memoize echo))

(println (mem-echo 1))
(println (mem-echo 1))
(println (mem-echo 1))
