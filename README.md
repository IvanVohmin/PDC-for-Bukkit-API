Useful libs for any operations with PersistanceDataContainer (1.16+).
## Usage for Itemstack (PDC)

```java
PDC pdc = new PDC(Itemstack item);
// lets put a String var:
pdc.setString("var_name", "value");
// get var from container:
int a = pdc.getInt("var_name");
// does it have a float var "price"?
if (pdc.hasFloat("price")) {
    // yes ...
} else {
    // no ...
}
// remove the var, for instance - Integer with name "amount":
// (.hasInt() is unnecessary for remove operations)
pdc.removeInt("amount")
// also when you set/remove var, action is automaticly saves in meta.
```

## Usage for Player (PDCP)

```java
PDCP pdcp = new PDCP(Player player);
// lets put a String var:
pdcp.setString("var_name", "value");
// get var from container:
int a = pdcp.getInt("var_name");
// does player have a float var "balance"?
if (pdcp.hasFloat("balance")) {
    // yes ...
} else {
    // no ...
}
// absolutely everything is the same as with the PDC!
```
