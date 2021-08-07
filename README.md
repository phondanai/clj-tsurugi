# clj-tsurugi

A small Clojure library to interact with [Kyoto Tycoon](https://dbmx.net/kyototycoon/).

Right now this can do just `GET`, `SET` and `REMOVE`.

## Installation
With Leiningen

```[clj-tsurugi "0.0.1"]```

## Quckstart

```clojure
; In your application
(:require [clj-tsurugi.core :as kt)

; or in the REPL:
(require '[clj-tsurugi.core :as kt])

; Create a client
(def kt-client (kt/client "http://localhost:1978"))

; Set the value of a record.
(kt-client :set "thailand" "bangkok")

; Retrieve the value of a record.
(kt-client :get "thailand")

; Remove a record.
(kt-client :del "thailand")

```

## License

Copyright © 2021 FIXME

This program and the accompanying materials are made available under the
terms of the Eclipse Public License 2.0 which is available at
http://www.eclipse.org/legal/epl-2.0.

This Source Code may also be made available under the following Secondary
Licenses when the conditions for such availability set forth in the Eclipse
Public License, v. 2.0 are satisfied: GNU General Public License as published by
the Free Software Foundation, either version 2 of the License, or (at your
option) any later version, with the GNU Classpath Exception which is available
at https://www.gnu.org/software/classpath/license.html.
