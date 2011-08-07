;;define refs
(def songs (ref #{}))
(def singers (ref #{}))

;;deference
(println "songs" @songs)
(println "singers" @singers)

;;ref-set
(dosync
 (ref-set songs #{"dangerous"})
 (ref-set singers #{"MJ"}))
(println "songs" @songs)
(println "singers" @singers)

;;alter
(dosync
 (alter songs conj  "heal the world"))
(println "songs" @songs)

;;commute
(dosync
 (commute songs conj  "heal the world"))
(println "songs" @songs)
