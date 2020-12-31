#include <bits/stdc++.h>
#define rep(i,n) for(int i=0;i<n;i++)
using namespace std;
using ll=long long int;

int main(){
  int n,k;
  cin>>n>>k;
  vector<int> a(n);
  for(int i=0;i<n;i++){
    cin>>a[i];
  }
  vector<int> sum(n+1);
  sum[0]=0;
  for(int i=0;i<n;i++){
    sum[i+1]=sum[i]+a[i];
  }
  int max=-1;
  for(int i=0;i<n-k;i++){
    max=max(max,sum[i+1]-sum[i]);
  }
  cout<<max<<endl;
}



